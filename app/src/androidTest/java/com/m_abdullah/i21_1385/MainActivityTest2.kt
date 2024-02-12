package com.m_abdullah.i21_1385


import android.view.View
import android.view.ViewGroup
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.Matchers.allOf
import org.hamcrest.Matchers.`is`
import org.hamcrest.TypeSafeMatcher
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class MainActivityTest2 {

    @Rule
    @JvmField
    var mActivityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun mainActivityTest2() {
        val appCompatImageView = onView(
            allOf(
                withId(R.id.myImageView),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.RelativeLayout")),
                        2
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        appCompatImageView.perform(click())

        val appCompatTextView = onView(
            allOf(
                withId(R.id.sign_up_link), withText("Sign up"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.login_bar),
                        7
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatTextView.perform(click())

        val appCompatButton = onView(
            allOf(
                withId(R.id.Sign_up_btn), withText("Sign Up"),
                childAtPosition(
                    allOf(
                        withId(R.id.login_bar),
                        childAtPosition(
                            withClassName(`is`("android.widget.ScrollView")),
                            0
                        )
                    ),
                    11
                )
            )
        )
        appCompatButton.perform(scrollTo(), click())

        val appCompatButton2 = onView(
            allOf(
                withId(R.id.verif_btn), withText("Verify"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    5
                ),
                isDisplayed()
            )
        )
        appCompatButton2.perform(click())

        val appCompatButton3 = onView(
            allOf(
                withId(R.id.login_button), withText("Login"),
                childAtPosition(
                    allOf(
                        withId(R.id.login_bar),
                        childAtPosition(
                            withClassName(`is`("android.widget.RelativeLayout")),
                            3
                        )
                    ),
                    6
                ),
                isDisplayed()
            )
        )
        appCompatButton3.perform(click())

        val appCompatTextView2 = onView(
            allOf(
                withId(R.id.chat_link_main),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.LinearLayout")),
                        0
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        appCompatTextView2.perform(click())

        val linearLayout = onView(
            allOf(
                withId(R.id.John_Text),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.RelativeLayout")),
                        2
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        linearLayout.perform(click())

        val appCompatTextView3 = onView(
            allOf(
                withId(R.id.call_btn),
                childAtPosition(
                    allOf(
                        withId(R.id.search_div),
                        childAtPosition(
                            withClassName(`is`("android.widget.RelativeLayout")),
                            0
                        )
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        appCompatTextView3.perform(click())

        val appCompatTextView4 = onView(
            allOf(
                withId(R.id.close_call),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.LinearLayout")),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatTextView4.perform(click())

        val appCompatTextView5 = onView(
            allOf(
                withId(R.id.video_call_btn),
                childAtPosition(
                    allOf(
                        withId(R.id.search_div),
                        childAtPosition(
                            withClassName(`is`("android.widget.RelativeLayout")),
                            0
                        )
                    ),
                    3
                ),
                isDisplayed()
            )
        )
        appCompatTextView5.perform(click())

        val appCompatTextView6 = onView(
            allOf(
                withId(R.id.close_vid_call),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.LinearLayout")),
                        3
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatTextView6.perform(click())

        val appCompatTextView7 = onView(
            allOf(
                withId(R.id.back_arrow),
                childAtPosition(
                    allOf(
                        withId(R.id.search_div),
                        childAtPosition(
                            withClassName(`is`("android.widget.RelativeLayout")),
                            0
                        )
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        appCompatTextView7.perform(click())

        val appCompatTextView8 = onView(
            allOf(
                withId(R.id.back_arrow),
                childAtPosition(
                    allOf(
                        withId(R.id.search_div),
                        childAtPosition(
                            withClassName(`is`("android.widget.RelativeLayout")),
                            0
                        )
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        appCompatTextView8.perform(click())

        val appCompatTextView9 = onView(
            allOf(
                withId(R.id.john), withText("John Cooper "),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.LinearLayout")),
                        0
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        appCompatTextView9.perform(click())

        val appCompatButton4 = onView(
            allOf(
                withId(R.id.join_community), withText("Join Community"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.Greetings),
                        3
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatButton4.perform(click())

        val appCompatButton5 = onView(
            allOf(
                withId(R.id.book_session), withText("Book a Session"),
                childAtPosition(
                    allOf(
                        withId(R.id.Greetings),
                        childAtPosition(
                            withClassName(`is`("android.widget.RelativeLayout")),
                            2
                        )
                    ),
                    4
                ),
                isDisplayed()
            )
        )
        appCompatButton5.perform(click())
    }

    private fun childAtPosition(
        parentMatcher: Matcher<View>, position: Int
    ): Matcher<View> {

        return object : TypeSafeMatcher<View>() {
            override fun describeTo(description: Description) {
                description.appendText("Child at position $position in parent ")
                parentMatcher.describeTo(description)
            }

            public override fun matchesSafely(view: View): Boolean {
                val parent = view.parent
                return parent is ViewGroup && parentMatcher.matches(parent)
                        && view == parent.getChildAt(position)
            }
        }
    }
}
