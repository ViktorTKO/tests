package com.tests.test.domain.entity

import org.hibernate.annotations.Type
import java.time.LocalDateTime
import java.util.*
import java.util.Collections.emptySet
import javax.persistence.*


@Entity
@Table(name = "test_table")
class TestEntity(@Column(name = "document_id") var documentId: UUID? = null,
                 @Column(name = "document_date") var documentDate: LocalDateTime? = null,
                 @Column(name = "dictionary_value_id") var dictionaryValueId: UUID? = null,
                 @Column(name = "dictionary_value_name") var dictionaryValueName: UUID? = null,
                 @Column(name = "sort_order") var sortOrder: String? = null) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    val id: Long = -1

    @Column(name = "test_id")
    var testId: UUID? = null
    @Column(name = "test_name")
    val testName: String = "Test"

    override fun toString(): String {
        return "TestEntity(documentId=$documentId, " +
                "documentDate=$documentDate," +
                " dictionaryValueId=$dictionaryValueId," +
                " dictionaryValueName=$dictionaryValueName," +
                " sortOrder=$sortOrder, id=$id)"
    }
}

