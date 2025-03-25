package com.example.calenderwidget

import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.provideContent
import androidx.glance.text.Text
import androidx.glance.GlanceId
import android.content.Context
import androidx.glance.appwidget.updateAll

class CalendarWidget : GlanceAppWidget() {
    override suspend fun provideGlance(context: Context, id: GlanceId) {
        // Fetch events (you’ll call this elsewhere, e.g., WorkManager)
        val events = GoogleCalendarApi.fetchEvents()

        provideContent {
            // Render UI with parsed data
            if (events.isNotEmpty()) {
                Text(events[0].title) // Display first event’s title
            } else {
                Text("No events today")
            }
        }
    }

    // Optional: Call this to refresh widget manually
    suspend fun refresh(context: Context) {
        updateAll(context)
    }
}