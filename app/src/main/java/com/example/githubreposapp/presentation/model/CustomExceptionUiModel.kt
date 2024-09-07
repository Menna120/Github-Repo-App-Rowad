package com.example.githubreposapp.presentation.model

sealed class CustomExceptionUiModel {

    object NoInternetConnection : CustomExceptionUiModel()

    object Network : CustomExceptionUiModel()

    object Timeout : CustomExceptionUiModel()

    object ServiceUnreachable : CustomExceptionUiModel()

    object Unknown : CustomExceptionUiModel()

}