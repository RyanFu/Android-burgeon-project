package com.tencent.tws.core.apidemos.preference;

import android.os.Bundle;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

import com.tencent.tws.core.preference.CheckBoxPreference;
import com.tencent.tws.core.preference.Preference;
import com.tencent.tws.core.preference.PreferenceActivity;
import com.tencent.tws.core.preference.SeekBarPreference;
import com.tencent.tws.core.preference.SwitchPreference;
import com.tencent.tws.burgeon.R;

/*
 * tws_checkbox_leftpadding Checkbox左边距
 * tws_checkbox_rightpadding Checkbox右边距
 * tws_radiobutton_leftpadding RadioButton左边距
 * tws_radiobutton_rightpadding RadioButton右边距
 * tws_switch_leftpadding Switch左边距
 * tws_switch_rightpadding Switch右边距
 */
public class PreferenceActivityDemo extends PreferenceActivity implements Preference.OnPreferenceRightIconClickListener, Preference.OnPreferenceClickListener, CompoundButton.OnCheckedChangeListener,
		OnSeekBarChangeListener {

	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		getWindow().requestFeature(Window.FEATURE_ACTION_BAR_OVERLAY);
		super.onCreate(arg0);
		setTitle(getResources().getString(R.string.preference_tittle));
		addPreferencesFromResource(R.xml.checkbox_preference);
		Preference pre = this.findPreference("Preference");
		pre.setCaption("hello");
		pre.setArrowVisible(true);
		pre.setArrowIcon(R.drawable.ic_search);

		SeekBarPreference mSeekBarPreference = (SeekBarPreference) findPreference("SeekBarPreference");
		mSeekBarPreference.setOnPreferenceSeekBarChangeListener(this);

		SwitchPreference mSwitchPreference = (SwitchPreference) findPreference("SwitchPreference");
		// mSwitchPreference.setCustomPadding(Preference.CUSTOM_INVALID,
		// Preference.CUSTOM_INVALID, 0, Preference.CUSTOM_INVALID);

		CheckBoxPreference mCheckBoxPreference = (CheckBoxPreference) findPreference("CheckBoxPreference");
		// mCheckBoxPreference.setCustomPadding(Preference.CUSTOM_INVALID,
		// Preference.CUSTOM_INVALID, 0, Preference.CUSTOM_INVALID);
	}

	@Override
	public boolean onPreferenceRightIconClick(Preference arg0) {
		// TODO Auto-generated method stub
		// return false;
		return true;
	}

	@Override
	public boolean onPreferenceClick(Preference arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
	}

	@Override
	public void onProgressChanged(SeekBar arg0, int arg1, boolean arg2) {
	}

	@Override
	public void onStartTrackingTouch(SeekBar arg0) {
	}

	@Override
	public void onStopTrackingTouch(SeekBar arg0) {
	}

}