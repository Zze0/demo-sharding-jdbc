package com.zze0.demo.shardingjdbc;

import com.zze0.demo.shardingjdbc.service.UserService;
import org.apache.shardingsphere.api.hint.HintManager;
import org.apache.shardingsphere.transaction.core.TransactionType;
import org.apache.shardingsphere.transaction.core.TransactionTypeHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShardingJdbcApplication.class)
public class ShardingJdbcApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	public void testTransaction() {
		try (HintManager hintManager = HintManager.getInstance()){
			hintManager.addDatabaseShardingValue("_user", "0");
//			TransactionTypeHolder.set(TransactionType.XA);

			userService.testTransaction();
		}
	}

}