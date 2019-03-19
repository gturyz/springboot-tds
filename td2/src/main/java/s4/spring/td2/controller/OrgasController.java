package s4.spring.td2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import s4.spring.td2.entities.Groupe;
import s4.spring.td2.entities.Organisation;
import s4.spring.td2.repositories.GroupeRepository;
import s4.spring.td2.repositories.OrgaRepository;

@Controller
@RequestMapping("/orgas/")
public class OrgasController {

	@Autowired
	private OrgaRepository orgaRepo;
	
	@Autowired
	private GroupeRepository repoGroupe;
	
	@RequestMapping("/")
	public String index (ModelMap model) {
		List<Organisation> orgas = orgaRepo.findAll();
		model.addAttribute("orgas", orgas);
		return "index";
	}
	
	@RequestMapping("create")
	@ResponseBody
	public String createOrga () {
		Organisation orga = new Organisation();
		orga.setName("IUT Ifs");
		orga.setDomain("unicaen.fr");
		orga.setAliases("iutc3.unicaen.fr");
		orga.setCity("Ifs");
		orgaRepo.save(orga);
		return orga + " ajoutée dans la bdd";
	}
	
	@RequestMapping("groupes")
	@ResponseBody
	public String createGroupe () {
		Groupe gr = new Groupe();
		gr.setName("IUT Ifs");
		gr.setEmail("@unicaen.fr");
		gr.setAliases("iutc3.unicaen.fr");
		repoGroupe.save(gr);
		return gr + " ajoutée dans la bdd";
	}
	
	@RequestMapping("create/groupes/{id}")
	@ResponseBody
	public String createOrgaWithGroupes (@PathVariable int id) {
		Optional<Organisation> optOrga = orgaRepo.findById(id);
		if (optOrga.isPresent()) {
			Organisation orga = optOrga.get();
			Groupe gr = new Groupe();
			gr.setName("Etudiants");
			gr.setOrganisation(orga);
			orga.getGroupes().add(gr);
			orgaRepo.save(orga);
			return orga + " ajoutée dans la bdd";
		}
		return "Organisation inexistante";
	}
	
}
