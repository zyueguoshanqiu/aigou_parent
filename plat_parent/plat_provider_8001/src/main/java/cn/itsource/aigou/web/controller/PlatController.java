package cn.itsource.aigou.web.controller;

import cn.itsource.aigou.common.AjaxResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/plat")
public class PlatController {

    @RequestMapping("/index")
    public AjaxResult index(){
        return AjaxResult.me().setMsg("成成成成工了");
    }
}
