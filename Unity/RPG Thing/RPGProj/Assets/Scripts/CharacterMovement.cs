using UnityEngine;

public class CharacterMovement : MonoBehaviour{
	//RigidBody instance
	private Rigidbody2D playerRB2d;
	//Boolean to determine which way player is facing
	public bool facingRight;
	//Speed modifier as float
	public float speed = 4.0f;
	private Animator anim = null;
	private GameObject playerSprite;
	public float max = 5;
	public float min = -5;
	//private GameObject playerSprite;
	//Initialize components
	void Awake()
	{
		playerRB2d = (Rigidbody2D)GetComponent(typeof(Rigidbody2D));
		//
		playerSprite = transform.Find ("PlayerSprite").gameObject;
		anim = (Animator)playerSprite.GetComponent(typeof(Animator));
	}

	//Update once per frame
	void Update () {
		//Cache horizontal input as vector
		float movePlayerVector = Input.GetAxisRaw("Horizontal");
	if(this.transform.position.x <= 11.2 && this.transform.position.x >= -11.2){
		anim.SetFloat("speed",Mathf.Abs (movePlayerVector));
		playerRB2d.velocity = new Vector2 (movePlayerVector * speed, 0);

		if (movePlayerVector > 0 && !facingRight)
		{
			flip ();
		}
		else if (movePlayerVector < 0 && facingRight){
			flip ();
		}
	}
	else if(this.transform.position.x > -11.2 && this.transform.position.x > 11.2){
		playerRB2d.velocity = new Vector2(-1, 0);
	}
		else if(this.transform.position.x < 11.2 && this.transform.position.x < -11.2){
			playerRB2d.velocity = new Vector2(1, 0);
		}
	else{
		playerRB2d.velocity = new Vector2 ( 0, 0);
		anim.SetFloat("speed", 0f);
	}
	}
	void flip()
	{
		//NOTE: You can do this in java!
		facingRight = !facingRight;

		//multiply player local scale (why though, dont undetsand)
		Vector3 theScale = playerSprite.transform.localScale;
		theScale.x *= -1;
		playerSprite.transform.localScale = theScale;
	}

}