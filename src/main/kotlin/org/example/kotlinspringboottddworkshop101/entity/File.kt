package org.example.kotlinspringboottddworkshop101.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDateTime

@Entity
@Table(name = "file")
data class File(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var fileName: String,
    var fileType: String,
    var status: String,
    var createdBy: String,
    var createdAt: LocalDateTime = LocalDateTime.now(),
)
