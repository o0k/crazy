package cn.zhp.设计模式.abstractfactory;

/**
 * Created by geely
 * Test 是 应用层
 * 抽象工厂:
 * 类爆炸
 * xxVideo:
 * xxArticle
 *
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();

        // ==========

    }
}
