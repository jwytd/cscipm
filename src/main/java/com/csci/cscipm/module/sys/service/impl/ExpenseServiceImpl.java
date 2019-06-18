package com.csci.cscipm.module.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.csci.cscipm.module.sys.dao.ExpenseMapper;
import com.csci.cscipm.module.sys.model.Expense;
import com.csci.cscipm.module.sys.service.IExpenseService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 报销表 服务实现类
 * </p>
 *
 * @author wudan
 * @since 2019-06-01
 */
@Service
public class ExpenseServiceImpl extends ServiceImpl<ExpenseMapper, Expense> implements IExpenseService {

}
