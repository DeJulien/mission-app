package dev.mission.exec;

import org.springframework.stereotype.Controller;

import dev.mission.entite.Mission;
import dev.mission.repository.MissionRepository;
import java.time.LocalDate;
import java.util.List;

@Controller
public class RechercherMissionParDateDebut implements Runnable {
	private MissionRepository missionRepository;

	public RechercherMissionParDateDebut(MissionRepository missionRepository) {
		super();
		this.missionRepository = missionRepository;
	}

	@Override
	public void run() {
		LocalDate dateDebutRecherche = LocalDate.of(2019, 1, 1);
		// TODO
		List<Mission> listMission= missionRepository.findAll();
		for(Mission mission : listMission)
		{
			if(mission.getDateDebut().equals(dateDebutRecherche))
				System.out.println(mission.getLibelle()+" "+mission.getDateDebut()+" "+mission.getDateFin()+" "+mission.getTauxJournalier());
		}
	}
}