# 介绍
这个项目主要是实现的是文件的存储，整合起一部分零零散散的数据。通过留下几个http的接口，让插件调用这些接口来扩展出各种各样的用途，说白了就是把云搬回家里。比如说转码，pdf与doc/excel/ppt的互相转化，dlna,bt下载，rss订阅，m3u8下载，云打印（垃圾菜鸟打印组件），定时采集任务，甚至接几个zigbee的设备或许就能介入智能家居（虽然我不会）

***

# 功能
- [x] 上传，下载文件
- [x] 多用户
- [x] 磁盘映射管理
- [x] 版本控制
- [x] 投屏 需搭配插件使用 
- [x] 基本文件预览
- [x] bt下载 (需自行下载aria2)
- [x] 减少重复文件上传
- [x] 压缩下载 批量下载
- [ ] 快速上传已存在的文件
- [ ] 权限控制
- [ ] 角色管理
- [ ] 转码，剪辑（ffmpeg）
- [ ] 部分网站的视频下载 （you-get）
- [ ] 定时采集任务


***

# 使用
1. 直接下载release的jar包和sql文件 
2. 导入sql文件
3. 以 Java -jar xxx.jar --ip=局域网ip即可 
4. 如果对数据库链接名字密码不满意也可以另外在args里指定 

# 插件 
