using UnityEngine;
using System.Collections;

public class FollowCamera : MonoBehaviour {
	public float xMargin = 1.5f;
	public float yMargin = 1.5f;
	public float xSmooth = 1.5f;
	public float ySmooth = 1.5f;
	private Vector2 maxXandY;
	private Vector2 minXandY;
	public Transform player;
	// Use this for initialization
	void Start () {
		player = GameObject.Find ("Player").transform;
		if (player == null){
			Debug.LogError ("Player object is null");
		}
	}

	void Awake(){
		var backgroundBounds = GameObject.Find("background").renderer.bounds;
		var camTopLeft = camera.ViewportToWorldPoint (new Vector3 (0, 0, 0));
		var camBottomRight = camera.ViewportToWorldPoint (new Vector3 (1, 1, 0));
		minXandY.x = backgroundBounds.min.x - camTopLeft.x;
		minXandY.x = backgroundBounds.max.x - camBottomRight.x;

	}
	
	bool CheckXMargin(){
		//returns true if the distance between the camera
		//and the player in the x axis is greater than the margin
		return Mathf.Abs (this.transform.position.x - player.position.x) > xMargin;
	}
	bool CheckYMargin(){
		//same as above method but for y
		return Mathf.Abs (this.transform.position.y - player.transform.position.y) > yMargin;
	}
	void FixedUpdate () {
		float targetX = this.transform.position.x;
		float targetY = this.transform.position.y;
		if(CheckXMargin()){
			targetX = Mathf.Lerp(this.transform.position.x, player.position.x, xSmooth * Time.fixedDeltaTime);
		}
		if(CheckYMargin()){
			targetY = Mathf.Lerp(this.transform.position.y, player.position.y, ySmooth * Time.fixedDeltaTime);
		}
		targetX = Mathf.Clamp (targetX, minXandY.x, maxXandY.x);
		targetY = Mathf.Clamp (targetY, minXandY.y, maxXandY.y);
		this.transform.position = new Vector3(targetX, this.transform.position.y, this.transform.position.z);
	}
}
