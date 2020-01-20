package dev.mission.exec;

import java.util.List;

import org.springframework.stereotype.Controller;

import dev.mission.entite.Mission;
import dev.mission.repository.MissionRepository;

//@Controller
public class ListerMissions implements Runnable {
	private MissionRepository missionRepository;

	public ListerMissions(MissionRepository missionRepository) {
		super();
		this.missionRepository = missionRepository;
	}

	@Override
	public void run() {
		List<Mission> listMission= missionRepository.findAll();
		
		for(Mission mission : listMission)
		{
			System.out.println(mission.getLibelle()+" "+mission.getDateDebut()+" "+mission.getDateFin()+" "+mission.getTauxJournalier());
		}
	}
}
