package com.jimmy.logfun.utils;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
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
     * @return 访问路径
     * @Author: Jimmy
     * @CreateDate: 2018/7/30 16:13
     */
    public String uploadImg(FileInputStream file, String key) {

        //  构造一个带指定Zone对象的配置类
        Configuration cfg = new Configuration(Zone.zone2());

        //  其他参数参考类注释
        UploadManager uploadManager = new UploadManager(cfg);

        //  生成上传凭证，然后准备上传
        try {
            Auth auth = Auth.create(accessKey, secretKey);
            String upToken = auth.uploadToken(bucket);
            try {
                Response response = uploadManager.put(file, key, upToken, null, null);

                //  解析上传成功的结果
                DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
                return path + "/" + putRet.key;
            } catch (QiniuException ex) {
                Response r = ex.response;
                System.err.println(r.toString());
                try {
                    System.err.println(r.bodyString());
                } catch (QiniuException ex2) {
                    //ignore
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}