import java.util.List;
import java.util.Map;

public class DataCollectionBuilder {

	private DataSource xData;
	private DataSource yData;
	private Resolution resolution;
	private Map<String, List<MatchedDataPair>> resultData;
	private Map<String, MatchedDataPair> finalResult;
	
	public DataCollectionBuilder(DataSource xData, DataSource yData, Resolution resolution) {
		
		this.xData = xData;
		this.yData = yData;
		this.resolution = resolution;
	}
	
	public String getTitle() {
		
		//TODO
		return "";
	}
	
	public void addToResult(DataSource x, DataSource y) {
		
		//resultData.put(x.getData());
//		List<MatchedDataPair> tempList;
//		tempList.add(x.getData());
		
		for(int k = 0; k < x.getData().size(); k++) {
			if(x.getData().get(1).equals(y.getData().get(1))) {
			
				double tempX = x.getData().get(1);
				double tempY = y.getData().get(1);
				MatchedDataPair tempPair = new MatchedDataPair(tempX, tempY);
			}
		}
	}
	
//	public DataCollection getResult() {
//		
//		
//	}
}
