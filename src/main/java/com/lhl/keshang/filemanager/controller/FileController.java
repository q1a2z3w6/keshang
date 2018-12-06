package com.lhl.keshang.filemanager.controller;

import com.lhl.keshang.pub.utils.JsonUtil;
import com.lhl.keshang.pub.utils.ResultUtil;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2018 XXX, Inc. All rights reserved. <p>
 * Company: XXX科技有限公司<p>
 *
 * @author 刘浩磊
 * @since 2018/11/13 17:16
 */
@RestController
public class FileController {
    private int count;
    @PostMapping("uploadHome")
    public String uploadHome(HttpServletRequest req, MultipartFile[] file){
        try{
            String path = req.getParameter("path");
            String uploadDir = getJarRootPath()+"/" + path +"/";
            String dir = getJarRootPath()+ "/";
            getFile(path,dir);
            for(int i = 0;i < file.length;i++){
                if(file[i] != null){
                    System.out.println(file[i]);
                    executeUpload(uploadDir,file[i]);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return JsonUtil.objectToJsonString(ResultUtil.error(100,e.getMessage()));
        }

        return JsonUtil.objectToJsonString(ResultUtil.success(""));

    }
    private void executeUpload(String uploadDir,MultipartFile file) throws  Exception{
        String fileName = file.getOriginalFilename();
        String start = fileName.substring(0,fileName.lastIndexOf("."));
        String last = fileName.substring(fileName.lastIndexOf("."));
        if(count == 0){
            count = 1;
            start = start + "_00" + count + "";
        }else{
            if(count < 9){
                count++;
                start = start + "_00" + count + "";
            }else if(count < 99){
                count++;
                start = start + "_0" + count + "";
            }else{
                count++;
                start = start + "_" + count + "";
            }

        }
        File serverFile = new File(uploadDir + start + last);
        file.transferTo(serverFile);
    }
    private static void  getFile(String path,String dir){
        String[] arr = path.split("/");
        for (int i = 0 ; i < arr.length;i++){
            dir = dir + arr[i] + "/";
            File newDir = new File(dir);
            if(!newDir.exists()){
                newDir.mkdir();
            }
        }
    }
    private  String getJarRootPath() throws Exception {
        String path = ResourceUtils.getURL("classpath:").getPath();
        //=> file:/root/tmp/demo-springboot-0.0.1-SNAPSHOT.jar!/BOOT-INF/classes!/
//        log.debug("ResourceUtils.getURL(\"classpath:\").getPath() -> " + path);
        //创建File时会自动处理前缀和jar包路径问题  => /root/tmp
        File rootFile = new File(path);
        if (!rootFile.exists()) {
//            log.info("根目录不存在, 重新创建");
            rootFile = new File("");
//            log.info("重新创建的根目录: " + rootFile.getAbsolutePath());
        }
//        log.debug("项目根目录: " + rootFile.getAbsolutePath());        //获取的字符串末尾没有分隔符 /
        return rootFile.getAbsolutePath();
    }
}
