package com.jimmy.logfun.utils;

import org.apache.ibatis.session.Configuration;
import org.springframework.beans.factory.annotation.Value;

import java.io.FileInputStream;

/**
 * @ProjectName: Jimmy-Repo
 * @Package: com.jimmy.logfun.utils
 * @ClassName: QiniuUtil
 * @Description: 七牛云上传图片工具类
 * @Author: Jimmy
 * @CreateDate: 2018/7/30 16:13
 * @UpdateUser:
 * @UpdateDate: 2018/7/30 16:13
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class QiniuUtil {
//    private static final Logger logger = LoggerFactory.getLogger(QiniuUtil.class);

    @Value("${qiniu.accessKey}")
    private String accessKey;

    @Value("${qiniu.secretKey}")
    private String secretKey;

    @Value("${qiniu.bucket}")
    private String bucket;

    @Value("${qiniu.path}")
    private String path;

    /**
     * 将图片上传到七牛云
     * @param file
     * @param key 保存在空间中的名字，如果为空会使用文件的hash值为文件名
     * @return
     * @Author: Jimmy
     * @CreateDate: 2018/7/30 16:13
     */
    public  String uploadImg(FileInputStream file, String key) {
        return "";
    }
}