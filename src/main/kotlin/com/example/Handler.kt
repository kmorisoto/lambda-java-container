package com.example

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler

class Handler : RequestHandler<Map<String, String>, String> {
    override fun handleRequest(input: Map<String,String>, context: Context): String {
        context.logger.log("Hello Kotlin $input")
        return "Hello Kotlin"
    }
}
