package com.yzf.ssm.handler;

import com.github.pagehelper.PageInfo;
import com.yzf.ssm.entity.Emp;
import com.yzf.ssm.service.api.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Slf4j
@Controller
public class EmpHandler {

    @Autowired
    private EmpService empService;

    @RequestMapping("/emp/all")
    public String getAll(HttpServletRequest request,
                         HttpServletResponse response, Model model) {
        List<Emp> all = empService.getAll();
        model.addAttribute("emplist", all);
        return "emp-list";
    }

    @RequestMapping("/emp/query/page")
    public String queryPage(
            @RequestParam("pageNo") Integer pageNo,
            HttpServletRequest request,
            HttpServletResponse response,
            Model model) {
        PageInfo<Emp> empPageInfo = empService.queryPage(pageNo);
        model.addAttribute("empPageInfo", empPageInfo);
        return "emp-page";
    }


}
