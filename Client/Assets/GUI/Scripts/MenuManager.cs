﻿using System.Collections.Generic;
using UnityEngine;

namespace beffio.OneMinuteGUI
{
	public class MenuManager : MonoBehaviour 
{
	public string AnimationPropertyName
    {
        get
        {
            return m_animationPropertyName;
        }

        set
        {
            m_animationPropertyName = value;
        }
    }

	public GameObject InitialScreen
    {
        get
        {
            return m_initialScreen;
        }

        set
        {
            m_initialScreen = value;
        }
    }

	public List<GameObject> NavigationHistory
    {
        get
        {
            return m_navigationHistory;
        }

        set
        {
            m_navigationHistory = value;
        }
    }
	
	[SerializeField]
	private string m_animationPropertyName;

	[SerializeField]
	private GameObject m_initialScreen;

	[SerializeField]
	private List<GameObject> m_navigationHistory;

	public void GoBack()
	{
		if (m_navigationHistory.Count > 1)
		{
			int index = m_navigationHistory.Count - 1;
			Animate(m_navigationHistory[index - 1], true);

			GameObject target = m_navigationHistory[index];
			m_navigationHistory.RemoveAt(index);
			Animate(target, false);
		}
	}

	public void GoToMenu(GameObject target)
	{
		if (target == null)
		{
			return;
		}

		if (m_navigationHistory.Count > 0)
		{
			Animate(m_navigationHistory[m_navigationHistory.Count - 1], false);
		}

		m_navigationHistory.Add(target);
		Animate(target, true);
	}

	private void Animate(GameObject target, bool direction)
	{
		if (target == null)
		{
			return;
		}

		target.SetActive(direction);

		Canvas canvasComponent = target.GetComponent<Canvas>();
		if (canvasComponent != null)
		{
			canvasComponent.overrideSorting = true;
			canvasComponent.sortingOrder = m_navigationHistory.Count;
		}

		Animator animatorComponent = target.GetComponent<Animator>();
		if (animatorComponent != null)
		{
			animatorComponent.SetBool(m_animationPropertyName, direction);
		}
	}

	private void Awake()
	{
			m_navigationHistory = new List<GameObject>();
			GoToMenu(m_initialScreen);
	}
}
}
