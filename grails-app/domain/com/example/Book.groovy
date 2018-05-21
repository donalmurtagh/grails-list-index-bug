package com.example

class Book {
    List images
    static hasMany = [images: Image]

    static constraints = {
        // we need both minSize and nullable: false to force at least one image to be saved with every evidence
        // https://github.com/grails/grails-core/issues/2115
        // https://groups.google.com/forum/#!topic/grails-dev-discuss/evQx2tz-DxI
        images minSize: 1, nullable: false
    }
}