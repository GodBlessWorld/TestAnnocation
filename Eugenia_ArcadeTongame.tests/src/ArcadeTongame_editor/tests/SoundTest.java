/**
 */
package ArcadeTongame_editor.tests;

import ArcadeTongame_editor.ArcadeTongame_editorFactory;
import ArcadeTongame_editor.Sound;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sound</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoundTest extends OpenerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SoundTest.class);
	}

	/**
	 * Constructs a new Sound test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoundTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sound test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Sound getFixture() {
		return (Sound)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ArcadeTongame_editorFactory.eINSTANCE.createSound());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SoundTest
