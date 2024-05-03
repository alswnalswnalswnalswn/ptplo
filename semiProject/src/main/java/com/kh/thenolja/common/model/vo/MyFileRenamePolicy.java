package com.kh.thenolja.common.model.vo;

import java.io.File;


// FileRenamePolicy를 구현해서 이름 바꾸기 정책을 사용할 예정
public class MyFileRenamePolicy implements FileRenamePolicy{
   
   public File rename(File originFile) {
      
      // 원본 파일명!!
      String originName = originFile.getName();
      
      int randomNo = (int)(Math.random() * 90000) + 10000;
      
      String ext = originName.substring(originName.lastIndexOf("."));
      
      String changeName = "review" + "_" + randomNo + ext;
      
      return new File(originFile.getParent(), changeName);
      
   }
   
      
   
}
