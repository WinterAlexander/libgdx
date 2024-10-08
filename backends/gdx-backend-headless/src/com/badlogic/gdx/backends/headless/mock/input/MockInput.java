/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.badlogic.gdx.backends.headless.mock.input;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.input.NativeInputConfiguration;

/** The headless backend does its best to mock elements. This is intended to make code-sharing between server and client as simple
 * as possible. */
public class MockInput implements Input {

	@Override
	public float getAccelerometerX () {
		return 0;
	}

	@Override
	public float getAccelerometerY () {
		return 0;
	}

	@Override
	public float getAccelerometerZ () {
		return 0;
	}

	@Override
	public float getGyroscopeX () {
		return 0;
	}

	@Override
	public float getGyroscopeY () {
		return 0;
	}

	@Override
	public float getGyroscopeZ () {
		return 0;
	}

	@Override
	public int getMaxPointers () {
		return 0;
	}

	@Override
	public int getX () {
		return 0;
	}

	@Override
	public int getX (int pointer) {
		return 0;
	}

	@Override
	public int getDeltaX () {
		return 0;
	}

	@Override
	public int getDeltaX (int pointer) {
		return 0;
	}

	@Override
	public int getY () {
		return 0;
	}

	@Override
	public int getY (int pointer) {
		return 0;
	}

	@Override
	public int getDeltaY () {
		return 0;
	}

	@Override
	public int getDeltaY (int pointer) {
		return 0;
	}

	@Override
	public boolean isTouched () {
		return false;
	}

	@Override
	public boolean justTouched () {
		return false;
	}

	@Override
	public boolean isTouched (int pointer) {
		return false;
	}

	@Override
	public float getPressure () {
		return 0;
	}

	@Override
	public float getPressure (int pointer) {
		return 0;
	}

	@Override
	public boolean isButtonPressed (int button) {
		return false;
	}

	@Override
	public boolean isButtonJustPressed (int button) {
		return false;
	}

	@Override
	public boolean isKeyPressed (int key) {
		return false;
	}

	@Override
	public boolean isKeyJustPressed (int key) {
		return false;
	}

	@Override
	public void getTextInput (TextInputListener listener, String title, String text, String hint) {

	}

	@Override
	public void getTextInput (TextInputListener listener, String title, String text, String hint, OnscreenKeyboardType type) {

	}

	@Override
	public void setOnscreenKeyboardVisible (boolean visible) {

	}

	@Override
	public void setOnscreenKeyboardVisible (boolean visible, OnscreenKeyboardType type) {

	}

	@Override
	public void openTextInputField (NativeInputConfiguration configuration) {

	}

	@Override
	public void closeTextInputField (boolean sendReturn) {

	}

	@Override
	public void setKeyboardHeightObserver (KeyboardHeightObserver observer) {

	}

	@Override
	public void vibrate (int milliseconds) {

	}

	@Override
	public void vibrate (int milliseconds, boolean fallback) {
	}

	@Override
	public void vibrate (int milliseconds, int amplitude, boolean fallback) {
	}

	@Override
	public void vibrate (VibrationType vibrationType) {
	}

	@Override
	public float getAzimuth () {
		return 0;
	}

	@Override
	public float getPitch () {
		return 0;
	}

	@Override
	public float getRoll () {
		return 0;
	}

	@Override
	public void getRotationMatrix (float[] matrix) {

	}

	@Override
	public long getCurrentEventTime () {
		return 0;
	}

	@Override
	public void setCatchKey (int keycode, boolean catchKey) {

	}

	@Override
	public boolean isCatchKey (int keycode) {
		return false;
	}

	@Override
	public void setInputProcessor (InputProcessor processor) {

	}

	private InputProcessor mockInputProcessor;

	@Override
	public InputProcessor getInputProcessor () {
		if (mockInputProcessor == null) {
			mockInputProcessor = new InputAdapter();
		}
		return mockInputProcessor;
	}

	@Override
	public boolean isPeripheralAvailable (Peripheral peripheral) {
		return false;
	}

	@Override
	public int getRotation () {
		return 0;
	}

	@Override
	public Orientation getNativeOrientation () {
		return Orientation.Landscape;
	}

	@Override
	public void setCursorCatched (boolean catched) {

	}

	@Override
	public boolean isCursorCatched () {
		return false;
	}

	@Override
	public void setCursorPosition (int x, int y) {

	}
}
