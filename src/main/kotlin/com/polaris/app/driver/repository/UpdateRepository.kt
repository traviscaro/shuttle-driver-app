package com.polaris.app.driver.repository

import com.polaris.app.driver.service.bo.UpdateShuttle

interface UpdateRepository{
    fun pushShuttleActivity(shuttle: UpdateShuttle)
}