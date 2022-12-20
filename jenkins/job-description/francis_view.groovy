 
listView('francis Jobs') {
    description('francis Jobs')
    jobs {
        regex('francis_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
