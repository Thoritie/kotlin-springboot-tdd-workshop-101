package org.example.kotlinspringboottddworkshop101.controller

import org.example.kotlinspringboottddworkshop101.service.FileService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.multipart.MultipartFile
import org.springframework.http.ResponseEntity

@RestController
@RequestMapping("api/files")
class FileController(private val fileService: FileService) {
    @GetMapping("/list")
    fun listFiles(): ResponseEntity<String> {
        return ResponseEntity.ok("list of files");
    }

    @PostMapping("/upload")
    fun uploadFile(@RequestParam("file") file: MultipartFile): ResponseEntity<String> {
        val metadata = fileService.uploadFile(file)
        return ResponseEntity.ok(metadata)
    }
}