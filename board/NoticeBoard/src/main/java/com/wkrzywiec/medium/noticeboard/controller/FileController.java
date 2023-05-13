package com.wkrzywiec.medium.noticeboard.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.util.Arrays;
@RestController
public class FileController {

    private Logger logger= LoggerFactory.getLogger(FileController.class);

    @PostMapping("/upload-files")
    public ResponseEntity<?> uploadMultipleFiles(
            @RequestParam("images")MultipartFile[] files
    ){
        this.logger.info("{} number of files uploaded",files.length);
        Arrays.stream(files).forEach(multipartFile -> {
            logger.info("file name : {} ",multipartFile.getOriginalFilename());
            logger.info("filename : {} ",multipartFile.getContentType());
            System.out.println("+++++++++++++++++");

        });
        return ResponseEntity.ok("file successfully uploaded!");


    }

//    @GetMapping("/zip")
//    public void zipDownload (HttpServletRequest request, HttpServletResponse response) throws IOException {
//
//        // List of files to be downloaded
//        List<Path> files = Arrays.asList(Paths.get("E:\\test.mp4"),
//                Paths.get("E:\\node.txt"),
//                Paths.get("E:\\keys.txt"));
//
//
//        response.setContentType("application/zip"); // zip archive format
//        response.setHeader(HttpHeaders.CONTENT_DISPOSITION, ContentDisposition.attachment()
//                .filename("download.zip", StandardCharsets.UTF_8)
//                .build()
//                .toString());
//
//
//        // Archiving multiple files and responding to the client
//        try(ZipOutputStream zipOutputStream = new ZipOutputStream(response.getOutputStream())){
//            for (Path file : files) {
//                try (InputStream inputStream = Files.newInputStream(file)) {
//                    zipOutputStream.putNextEntry(new ZipEntry(file.getFileName().toString()));
//                    StreamUtils.copy(inputStream, zipOutputStream);
//                    zipOutputStream.flush();
//                }
//            }
//        }
//    }
}
