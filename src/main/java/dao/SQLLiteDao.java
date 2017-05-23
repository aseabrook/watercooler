package dao;

import org.javalite.activejdbc.DB;
import org.slf4j.LoggerFactory;

import java.sql.SQLData;
import java.util.logging.Logger;

/**
 * Created by aaron on 23/5/2017.
 */
public class SQLLiteDao implements DAOInterface {

    private  final org.slf4j.Logger logger = LoggerFactory.getLogger(SQLLiteDao.class);

    public void  establishConnection() {
        logger.info("Creating SQLiteConnection");
        new DB().open();
    }

    public void  closeConnection() {
        new DB().close();
    }


}
