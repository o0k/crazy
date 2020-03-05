package cn.zhp.设计模式.abstractfactory;


/**
 * Created by geely
 */
public interface CourseFactory {
    // 获取视频
    Video getVideo();

    // 获取手记
    Article getArticle();

}
