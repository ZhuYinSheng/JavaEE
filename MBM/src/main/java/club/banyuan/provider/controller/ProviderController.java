package club.banyuan.provider.controller;

import club.banyuan.provider.entity.Provider;
import club.banyuan.provider.service.ProviderService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/server/provider")

public class ProviderController {

  @Autowired
  private ProviderService providerService;

  @RequestMapping("/list")
  public List<Provider> getUserList(@RequestBody(required = false) Provider provider) {
    if (provider == null) {
      return providerService.getProviderList();
    } else {
      return providerService.getProviderListByNameAndDesc(provider.getName(), provider.getDesc());
    }
  }

  @RequestMapping("/get")
  public Provider getUserId(@RequestBody Provider provider) {
    return providerService.getProviderById(provider.getId());
  }

  @RequestMapping("/modify")
  public String modify(String id, String name, String phone, String desc, String contactpreson) {
    Provider provider = new Provider();
    provider.setId(Integer.parseInt(id));
    provider.setName(name);
    provider.setDesc(desc);
    provider.setPhone(phone);
    provider.setContactPerson(contactpreson);
    providerService.saveProvider(provider);
    return "redirect:/provider_list.html";
  }

  @RequestMapping("/delete")
  public String deleteUser(Provider provider) {
    providerService.deleteProvider(provider.getId());
    return "redirect:/provider_list.html";
  }

}
