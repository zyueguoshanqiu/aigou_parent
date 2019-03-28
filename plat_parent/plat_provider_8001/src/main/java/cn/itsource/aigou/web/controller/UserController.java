package cn.itsource.aigou.web.controller;

import cn.itsource.aigou.common.AjaxResult;
import cn.itsource.aigou.domain.User;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody User user){
        if (user!=null&& !StringUtils.isEmpty(user.getName())&& !StringUtils.isEmpty(user.getPwd())){
            System.out.println("*********");
            if ("admin".equals(user.getName())&&"123".equals(user.getPwd())){
                return AjaxResult.me().setMsg("OK");
            }else {
                return AjaxResult.me().setMsg("NO").setSuccess(false).setMsg("帐号密码错误");
            }
        }else {
            return AjaxResult.me().setMsg("NO").setSuccess(false).setMsg("请输入完整用户名密码");
        }
    }
}
