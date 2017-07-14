package com.millsofmn.annotations.tomcat;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TomcatEnvLocalTestConfig.class})
public class TomcatEnvLocalTest {

	private static final String stageName = "LOCAL";

	@Autowired
	TomcatEnvStageInterface stage;

	@BeforeClass
	public static void executeBeforeClass(){
		System.setProperty("TOMCATENV", stageName);
	}

	@AfterClass
	public static void executeAfterClass(){
		System.clearProperty("TOMCATENV");
	}

	@Test
	public void testStage(){
		assertThat(stage.getWhoIs(), is(stageName));
	}

}
