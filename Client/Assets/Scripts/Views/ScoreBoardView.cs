﻿using UnityEngine;
using System.Collections;
using UnityEngine.UI;

public class ScoreBoardView : MonoBehaviour {

    public ScoreBoardState state;
    public float verticalSpacing = 5.0f;

    public PlayerScoreEntryView playerScoreTextPrefab;
    public PlayerScoreEntryView[] playerScoreTextElems;

	// Use this for initialization
	void Start () {
        this.playerScoreTextElems = new PlayerScoreEntryView[state.maxScoreboardPlayers];
	    for (int i = 0; i < state.maxScoreboardPlayers; i++)
        {
            this.playerScoreTextElems[i] = Instantiate<PlayerScoreEntryView>(playerScoreTextPrefab);
            this.playerScoreTextElems[i].transform.parent = this.transform;
            this.playerScoreTextElems[i].transform.localPosition = Vector3.zero;
            this.playerScoreTextElems[i].GetComponent<RectTransform>().anchoredPosition = Vector3.down * i * verticalSpacing;
            this.playerScoreTextElems[i].transform.localScale = Vector3.one;
            this.playerScoreTextElems[i].transform.localRotation = Quaternion.identity;
        }
	}
	
	// Update is called once per frame
	void Update () {
	    for (int i = 0; i < this.state.maxScoreboardPlayers; i++)
        {
            this.playerScoreTextElems[i].playerNameText.text = this.state.playerScores[i].playerName;
            this.playerScoreTextElems[i].playerScoreText.text = this.state.playerScores[i].playerScore.ToString();
        }
	}
}
