import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;
import short4.Electronic;
import short4.ShortMapper;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Short4MapperTest {
  private  static Logger logger=Logger.getLogger(Short4MapperTest.class);

    @Test
    public void test4(){
      //读取全局配置文件
        String resource="mybatis-config.xml";
        SqlSession sqlSession=null;
        List<Electronic> list =new ArrayList<Electronic>();
        try {
            //获取mybatis-config.xml文件的输入流
            InputStream is= Resources.getResourceAsStream(resource);
            //创建sqlsessionFactory对象，此对象可以完成对配置文件对读取
            SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
            sqlSession=factory.openSession();
            list=sqlSession.getMapper(ShortMapper.class).gitproduction();
        }catch (Exception e){
             e.printStackTrace();
        }finally {
             sqlSession.close();
        }
         for(Electronic el:list){
           logger.debug("大于2015年的设备有："+el.getModel()+"  生产日期为："+el.getProduction()+"  价格为:"+el.getPrice());
       }
    }
}
