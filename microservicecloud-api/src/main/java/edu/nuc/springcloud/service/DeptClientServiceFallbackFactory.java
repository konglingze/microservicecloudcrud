package edu.nuc.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import edu.nuc.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

	@Override
	public DeptClientService create(Throwable cause) {

		return new DeptClientService() {

			@Override
			public List<Dept> list() {

				return null;
			}

			@Override
			public Dept get(Long id) {

				return new Dept().setDeptno(id).setDname("客户端服务降级处理").setDb_source("数据库没有查到该数据");
			}

			@Override
			public boolean add(Dept dept) {

				return false;
			}
		};
	}

}
