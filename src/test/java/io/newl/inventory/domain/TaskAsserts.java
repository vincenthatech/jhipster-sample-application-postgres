package io.newl.inventory.domain;

import static org.assertj.core.api.Assertions.assertThat;

public class TaskAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertTaskAllPropertiesEquals(Task expected, Task actual) {
        assertTaskAutoGeneratedPropertiesEquals(expected, actual);
        assertTaskAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertTaskAllUpdatablePropertiesEquals(Task expected, Task actual) {
        assertTaskUpdatableFieldsEquals(expected, actual);
        assertTaskUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertTaskAutoGeneratedPropertiesEquals(Task expected, Task actual) {
        assertThat(actual)
            .as("Verify Task auto generated properties")
            .satisfies(a -> assertThat(a.getId()).as("check id").isEqualTo(expected.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertTaskUpdatableFieldsEquals(Task expected, Task actual) {
        assertThat(actual)
            .as("Verify Task relevant properties")
            .satisfies(a -> assertThat(a.getTitle()).as("check title").isEqualTo(expected.getTitle()))
            .satisfies(a -> assertThat(a.getDescription()).as("check description").isEqualTo(expected.getDescription()));
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertTaskUpdatableRelationshipsEquals(Task expected, Task actual) {
        assertThat(actual)
            .as("Verify Task relationships")
            .satisfies(a -> assertThat(a.getJobs()).as("check jobs").isEqualTo(expected.getJobs()));
    }
}
