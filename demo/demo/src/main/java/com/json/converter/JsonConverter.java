package com.json.converter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.json.converter.entity.Block;
import com.json.converter.entity.Floor;
import com.json.converter.entity.Units;

import java.util.ArrayList;
import java.util.List;

public class JsonConverter {

	public static void main(String[] args) {
		// Create list to hold multiple blocks
		List<Block> blocks = new ArrayList<>();

		// Block 1
		Block block1 = new Block();
		block1.setBlocknumber(1);

		List<Floor> floors1 = new ArrayList<>();

		Floor floor1Block1 = new Floor();
		floor1Block1.setFloornumber(1);
		List<Units> unitsFloor1Block1 = new ArrayList<>();
		unitsFloor1Block1.add(createUnit(4, true, "6644235e-e2d1-4dcf-935f-7f00eeed182d"));
		unitsFloor1Block1.add(createUnit(5, true, "7780ae3a-e2d1-4dcf-935f-7f00eeed182d"));
		floor1Block1.setUnits(unitsFloor1Block1);
		floors1.add(floor1Block1);

		Floor floor2Block1 = new Floor();
		floor2Block1.setFloornumber(3);
		List<Units> unitsFloor2Block1 = new ArrayList<>();
		unitsFloor2Block1.add(createUnit(4, true, "6644235e-e2d1-4dcf-935f-7f00eeed182d"));
		floor2Block1.setUnits(unitsFloor2Block1);
		floors1.add(floor2Block1);

		Floor floor3Block1 = new Floor();
		floor3Block1.setFloornumber(4);
		List<Units> unitsFloor3Block1 = new ArrayList<>();
		unitsFloor3Block1.add(createUnit(4, true, "6644235e-e2d1-4dcf-935f-7f00eeed182d"));
		floor3Block1.setUnits(unitsFloor3Block1);
		floors1.add(floor3Block1);

		Floor floor4Block1 = new Floor();
		floor4Block1.setFloornumber(5);
		List<Units> unitsFloor4Block1 = new ArrayList<>();
		unitsFloor4Block1.add(createUnit(4, true, "6644235e-e2d1-4dcf-935f-7f00eeed182d"));
		floor4Block1.setUnits(unitsFloor4Block1);
		floors1.add(floor4Block1);

		block1.setFloors(floors1);
		blocks.add(block1);

		// Block 2
		Block block2 = new Block();
		block2.setBlocknumber(6);

		List<Floor> floors2 = new ArrayList<>();

		Floor floor1Block2 = new Floor();
		floor1Block2.setFloornumber(3);
		List<Units> unitsFloor1Block2 = new ArrayList<>();
		unitsFloor1Block2.add(createUnit(4, true, "6644235e-e2d1-4dcf-935f-7f00eeed182d"));
		floor1Block2.setUnits(unitsFloor1Block2);
		floors2.add(floor1Block2);

		Floor floor2Block2 = new Floor();
		floor2Block2.setFloornumber(4);
		List<Units> unitsFloor2Block2 = new ArrayList<>();
		unitsFloor2Block2.add(createUnit(4, true, "6644235e-e2d1-4dcf-935f-7f00eeed182d"));
		unitsFloor2Block2.add(createUnit(5, true, "7780ae3a-e2d1-4dcf-935f-7f00eeed182d"));
		floor2Block2.setUnits(unitsFloor2Block2);
		floors2.add(floor2Block2);

		Floor floor3Block2 = new Floor();
		floor3Block2.setFloornumber(5);
		List<Units> unitsFloor3Block2 = new ArrayList<>();
		unitsFloor3Block2.add(createUnit(4, true, "6644235e-e2d1-4dcf-935f-7f00eeed182d"));
		floor3Block2.setUnits(unitsFloor3Block2);
		floors2.add(floor3Block2);

		block2.setFloors(floors2);
		blocks.add(block2);

		// Block 3
		Block block3 = new Block();
		block3.setBlocknumber(8);

		List<Floor> floors3 = new ArrayList<>();

		Floor floor1Block3 = new Floor();
		floor1Block3.setFloornumber(3);
		List<Units> unitsFloor1Block3 = new ArrayList<>();
		unitsFloor1Block3.add(createUnit(4, true, "6644235e-e2d1-4dcf-935f-7f00eeed182d"));
		floor1Block3.setUnits(unitsFloor1Block3);
		floors3.add(floor1Block3);

		Floor floor2Block3 = new Floor();
		floor2Block3.setFloornumber(4);
		List<Units> unitsFloor2Block3 = new ArrayList<>();
		unitsFloor2Block3.add(createUnit(4, true, "6644235e-e2d1-4dcf-935f-7f00eeed182d"));
		floor2Block3.setUnits(unitsFloor2Block3);
		floors3.add(floor2Block3);

		Floor floor3Block3 = new Floor();
		floor3Block3.setFloornumber(5);
		List<Units> unitsFloor3Block3 = new ArrayList<>();
		unitsFloor3Block3.add(createUnit(4, true, "6644235e-e2d1-4dcf-935f-7f00eeed182d"));
		floor3Block3.setUnits(unitsFloor3Block3);
		floors3.add(floor3Block3);

		block3.setFloors(floors3);
		blocks.add(block3);

		// Convert list of Block objects to JSON
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonOutput = gson.toJson(blocks);

		// Print JSON output
		System.out.println(jsonOutput);
	}

	private static Units createUnit(int unitNumber, boolean available, String modelUuid) {
		Units unit = new Units();
		unit.setUnitnumber(unitNumber);
		unit.setAvailable(available);
		unit.setModelUuid(modelUuid);
		return unit;
	}
}
