package gspbugtest

class CustomTagLib {

    static namespace = 'f'

    def rend = { attrs ->
        out << g.render(attrs)
    }


}
