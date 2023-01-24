package com.file.Service;

import org.springframework.web.multipart.MultipartFile;

import com.file.entity.Attachment;

public interface AttachmentService {

	Attachment saveAttachment(MultipartFile file) throws Exception;

	Attachment getAttachment(String fileId) throws Exception;

}
