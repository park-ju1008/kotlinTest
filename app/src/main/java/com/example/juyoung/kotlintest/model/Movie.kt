package com.example.juyoung.kotlintest.model

class Movie() {
    var title: String? = null
    var link: String? = null
    var image: String? = null
    var pubDate: String? = null
    var director: String? = null
    var actor: String? = null
    var userRating: Float? = null

    constructor(title: String) : this() {
        this.title = title
    }

    constructor(
        title: String,
        link: String,
        image: String,
        pubDate: String,
        director: String,
        actor: String,
        userRating: Float
    ) : this() {
        this.title = title
        this.link = link
        this.image = image
        this.pubDate = pubDate
        this.director = director
        this.actor = actor
        this.userRating = userRating
    }
}