package cn.j.netstorage.Service;

import cn.j.netstorage.Entity.File.HardDiskDevice;
import cn.j.netstorage.Entity.File.OriginFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface OriginFileService {

    OriginFile saveOriginFile(OriginFile originFile);

    OriginFile originFile();

    List<OriginFile> originFiles(Long ... id);

    OriginFile originFile(MultipartFile file, HardDiskDevice hardDiskDevice) throws IOException;

    OriginFile originFile(File file, HardDiskDevice hardDiskDevice) throws IOException;

    OriginFile originFile(String md5);

}
