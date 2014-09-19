package com.demo.service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.directwebremoting.WebContext;
import org.directwebremoting.WebContextFactory;

public class FileService {
	public String upload(InputStream inputStream,String fileName) throws IOException{
		String tempFileName=FilenameUtils.getName(fileName);
		String path=getRealPath("upload");
		File file=new File(path+File.separator+tempFileName);
		FileUtils.copyInputStreamToFile(inputStream, file);
		return file.getPath();
	}
	public String getRealPath(String dir){
		WebContext context=WebContextFactory.get();
		return context.getSession().getServletContext().getRealPath(dir);
	}
}
