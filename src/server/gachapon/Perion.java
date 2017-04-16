package server.gachapon;

/**
*
* @author SharpAceX(Alan)
*/

public class Perion extends GachaponItems {

	@Override
	public int[] getCommonItems() {
		return new int [] {
				//warriorEquips = {
				1002002, 1002003, 1002004, 1002005, 1002007, 
				1002009, 1002011, 1002021, 1002022, 1002023, 
				1002024, 1002025, 1002027, 1002028, 1002029, 
				1002030, 1002039, 1002040, 1002043, 1002044, 
				1002045, 1002046, 1002047, 1002048, 1002049, 
				1002050, 1002051, 1002052, 1002055, 1002056, 
				1002058, 1002059, 1002084, 1002085, 1002086, 
				1002087, 1002088, 1002091, 1002092, 1002093, 
				1002094, 1002095, 1002098, 1002099, 1002100, 
				1002101, 1002338, 1002339, 1002340, 1002377, 
				1002378, 1002379, 1002528, 1002529, 1002530, 
				1002531, 1002532, 1002551, 1002578, 
				1002790, 1040000, 1040009, 1040012, 1040015, 
				1040016, 1040021, 1040026, 1040028, 1040029, 
				1040030, 1040037, 1040038, 1040039, 1040040, 
				1040041, 1040085, 1040086, 1040087, 1040088, 
				1040089, 1040090, 1040091, 1040092, 1040093, 
				1040102, 1040103, 1040104, 1040111, 1040112, 
				1040113, 1040120, 1040121, 1040122, 1041014, 
				1041019, 1041020, 1041021, 1041022, 1041023, 
				1041024, 1041064, 1041084, 1041085, 1041086, 
				1041087, 1041088, 1041089, 1041091, 1041092, 
				1041093, 1041097, 1041098, 1041099, 1041119, 
				1041120, 1041121, 1041122, 1041123, 1041124, 
				1050000, 1050005, 1050006, 1050007, 1050011, 
				1050021, 1050022, 1050080, 1050081, 1050082, 
				1050083, 1051000, 1051001, 1051010, 1051011, 
				1051012, 1051013, 1051014, 1051015, 1051016, 
				1051077, 1051078, 1051079, 1051080, 1052075, 
				1052160, 1060000, 1060008, 1060009, 
				1060010, 1060011, 1060016, 1060017, 1060018, 
				1060019, 1060020, 1060027, 1060028, 1060029, 
				1060030, 1060060, 1060074, 1060075, 1060076, 
				1060077, 1060078, 1060079, 1060080, 1060081, 
				1060082, 1060090, 1060091, 1060092, 1060100, 
				1060101, 1060102, 1060109, 1060110, 1060111, 
				1061014, 1061015, 1061016, 1061017, 1061018, 
				1061019, 1061020, 1061023, 1061083, 1061084, 
				1061085, 1061086, 1061087, 1061088, 1061090, 
				1061091, 1061092, 1061096, 1061097, 1061098, 
				1061118, 1061119, 1061120, 1061121, 1061122, 
				1061123, 1072000, 1072002, 1072003, 1072007, 
				1072009, 1072011, 1072039, 1072040, 1072041, 
				1072046, 1072047, 1072050, 1072051, 1072052, 
				1072053, 1072112, 1072113, 1072126, 1072127, 
				1072132, 1072133, 1072134, 1072135, 1072147, 
				1072148, 1072149, 1072154, 1072155, 1072156, 
				1072168, 1072196, 1072197, 1072198, 1072210, 
				1072211, 1072212, 1072220, 1072221, 1072222, 
				1072273, 1082000, 1082001, 
				1082003, 1082004, 1082005, 1082006, 1082007, 
				1082008, 1082009, 1082010, 1082011, 1082023, 
				1082024, 1082025, 1082035, 1082036, 1082059, 
				1082060, 1082061, 1082103, 1082104, 1082105, 
				1082114, 1082115, 1082116, 1082117, 1082128, 
				1082129, 1082130, 1082139, 1082140, 1082141, 
				1082168, 1082218, 1082239, 1092000, 
				1092001, 1092002, 1092004, 1092005, 1092006, 
				1092007, 1092009, 1092010, 1092011, 1092012, 
				1092013, 1092014, 1092015, 1092016, 1092017, 
				1092023, 1092024, 1092025, 1092026, 1092027, 
				1092028, 1092036, 1092037, 1092038, 
				1092060, 1092061, 1302002, 1302004, 1302005, 
				1302008, 1302009, 1302010, 1302011, 1302012, 
				1302015, 1302018, 1302019, 1302023, 1302037, 
				1302056, 1302059, 1302068, 1302079, 
				1312001, 1312003, 1312005, 
				1312006, 1312007, 1312008, 1312009, 1312010, 
				1312011, 1312015, 1312016, 1312030, 1312031, 
				1322014, 1322015, 
				1322016, 1322017, 1322018, 1322019, 1322020, 
				1322028, 1322029, 1322045, 1322052, 1322059, 
				1322062, 1402000, 
				1402002, 1402003, 1402004, 1402005, 1402006, 
				1402007, 1402008, 1402011, 1402012, 1402015, 
				1402016, 1402017, 1402018, 1402035, 1402036,
				1412000, 1412002, 
				1412003, 1412004, 1412005, 1412006, 1412007, 
				1412008, 1412009, 1412010, 1412012, 1412021, 
				1412026, 1412032, 1412040, 
				1422001, 1422002, 1422003, 1422005, 
				1422007, 1422008, 1422009, 1422010, 1422012, 
				1422013, 1422027, 1422028, 1422030, 1422031, 
				1422038, 1422044, 1432002, 1432003, 
				1432004, 1432005, 1432006, 1432007, 1432010, 
				1432011, 1432030, 1432038, 1432045, 
				1432048, 1432056, 1442001, 1442002, 
				1442003, 1442005, 1442006, 1442007, 1442008, 
				1442009, 1442010, 1442019, 1442020, 1442044, 
				1442045, 1442060, 1442067, 
				//magicianEquips = {
				1002075, 1050035, 1002151, 1051023, 1072089, 
				1072115, 1072076, 1040018, 1382017, 1072072, 
				//bowmanEquips = {
				1040011, 1041061, 1040076, 1040003, 1072059, 
				1082017, 1002114, 1041066, 1060057, 1040007, 
				//thiefEquips = {
				1072032, 1472011, 1082037, 1040059, 1040084, 
				1040043, 1072085, 1040031, 1332031, 1082075, 
				//pirateEquips = {
				1482001, 1492002, 1052113, 1002616, 1072294, 
				1492004, 1482006, 1082192, 1082189, 1082195, 
		};
	}

	@Override
	public int[] getUncommonItems() {
		//All Scrolls
		return new int [] {
				2043000, 2043001, 2043002, 2043004, 2043005, 2043006, 2043007, 2043008, 2043009, 2043010,
				2043015, 2043017, 2043019, 2044000, 2044001, 2044002, 2044004, 2044005, 2044010, 2044012,
				2044014, 2043200, 2043201, 2043202, 2043204, 2043205, 2043210, 2043212, 2043214, 2044200,
				2044201, 2044202, 2044204, 2044205, 2044210, 2044212, 2044214, 2044300, 2044301, 2044302,
				2044304, 2044305, 2044310, 2044312, 2044314, 2044400, 2044401, 2044402, 2044404, 2044405,
				2044410, 2044412, 2044414,
		};
	}

	@Override
	public int[] getRareItems() {
		return new int [] {1402037, 1402049, 1072361, 1402048, 1402049, 1402050, 1402051};
	}

}
