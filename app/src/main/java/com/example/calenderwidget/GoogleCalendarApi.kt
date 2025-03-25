package com.example.calenderwidget

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
// Add Google API client imports later

data class CalendarEvent(val title: String, val startTime: String)

object GoogleCalendarApi {
    suspend fun fetchEvents(): List<CalendarEvent> = withContext(Dispatchers.IO) {
        // API call logic here (e.g., Google Calendar API)
        // Parse response into CalendarEvent objects
        listOf(CalendarEvent("Sample Event", "2025-03-25"))
        //TODO Fetch the calender and parse the data
    }
}