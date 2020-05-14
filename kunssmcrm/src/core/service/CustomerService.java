package core.service;

import common.utils.Page;
import core.bean.Customer;



public interface CustomerService {

	// 查询客户列表
	public Page<Customer> findCustomerList(Integer page, Integer rows, String custName,  String custSource,String custIndustry,String custLevel);

	public Customer getCustomerById(Long id);

	public void updateCustomer(Customer customer);

	public void deleteCustomer(Long id);
}
