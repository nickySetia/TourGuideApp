/**
 * Information on a route returned by an instance of RoutingService.
 */
public class RouteInfo {
	private List<LatLong> waypoints;

	public RouteInfo(List<LatLong> waypoints) {
		this.waypoints = waypoints;
	}

	public List<LatLong> getWaypoints() {
		return waypoints;
	}
	
}
