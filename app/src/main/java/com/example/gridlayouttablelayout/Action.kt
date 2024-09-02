package com.example.gridlayouttablelayout

import android.content.Context
import android.widget.Toast

fun actionClick(data: Status, con: Context) {
    if (data.id == "resetBTN") {
        data.fOIS = false
        data.sOIS = false
        data.fo = 0.0
        data.so = 0.0
        data.res = 0.0
        data.completed = false
        data.oper = "0"
        data.inputET = ""
        return
    }
    if (data.completed) return

    if (data.oper == "0") {
        when (data.id) {
            "oneBTN" -> {
                data.inputET += "1"
                data.fo = data.fo * 10 + 1
                data.fOIS = true
                return
            }

            "twoBTN" -> {
                data.inputET += "2"
                data.fo = data.fo * 10 + 2
                data.fOIS = true
                return
            }

            "threeBTN" -> {
                data.inputET += "3"
                data.fo = data.fo * 10 + 3
                data.fOIS = true
                return
            }

            "fourBTN" -> {
                data.inputET += "4"
                data.fo = data.fo * 10 + 4
                data.fOIS = true
                return
            }

            "fiveBTN" -> {
                data.inputET += "5"
                data.fo = data.fo * 10 + 5
                data.fOIS = true
                return
            }

            "sixBTN" -> {
                data.inputET += "6"
                data.fo = data.fo * 10 + 6
                data.fOIS = true
                return
            }

            "sevenBTN" -> {
                data.inputET += "7"
                data.fo = data.fo * 10 + 7
                data.fOIS = true
                return
            }

            "eightBTN" -> {
                data.inputET += "8"
                data.fo = data.fo * 10 + 8
                data.fOIS = true
                return
            }

            "nineBTN" -> {
                data.inputET += "9"
                data.fo = data.fo * 10 + 9
                data.fOIS = true
                return
            }

            "zeroBTN" -> {
                data.inputET += "0"
                data.fo = data.fo * 10
                data.fOIS = true
                return
            }
        }
        if (data.fOIS == false) {
            Toast.makeText(con, R.string.no_data, Toast.LENGTH_LONG).show()
            return
        }

        if (data.oper != "0") {
            when (data.id) {
                "oneBTN" -> {
                    data.inputET += "1"
                    data.so = data.so * 10 + 1
                    data.sOIS = true
                    return
                }

                "twoBTN" -> {
                    data.inputET += "2"
                    data.so = data.so * 10 + 2
                    data.sOIS = true
                    return
                }

                "threeBTN" -> {
                    data.inputET += "3"
                    data.so = data.so * 10 + 3
                    data.sOIS = true
                    return
                }

                "fourBTN" -> {
                    data.inputET += "4"
                    data.so = data.so * 10 + 4
                    data.sOIS = true
                    return
                }

                "fiveBTN" -> {
                    data.inputET += "5"
                    data.so = data.so * 10 + 5
                    data.sOIS = true
                    return
                }

                "sixBTN" -> {
                    data.inputET += "6"
                    data.so = data.so * 10 + 6
                    data.sOIS = true
                    return
                }

                "sevenBTN" -> {
                    data.inputET += "7"
                    data.so = data.so * 10 + 7
                    data.sOIS = true
                    return
                }

                "eightBTN" -> {
                    data.inputET += "8"
                    data.so = data.so * 10 + 8
                    data.sOIS = true
                    return
                }

                "nineBTN" -> {
                    data.inputET += "9"
                    data.so = data.so * 10 + 9
                    data.sOIS = true
                    return
                }

                "zeroBTN" -> {
                    data.inputET += "0"
                    data.so = data.so * 10
                    data.sOIS = true
                    return
                }

                "divisionBTN" -> {
                    Toast.makeText(con, R.string.calculqtor_is_stupid, Toast.LENGTH_LONG).show()
                    return
                }

                "multiplicationBTN" -> {
                    Toast.makeText(con, R.string.calculqtor_is_stupid, Toast.LENGTH_LONG).show()
                    return
                }

                "differenceBTN" -> {
                    Toast.makeText(con, R.string.calculqtor_is_stupid, Toast.LENGTH_LONG).show()
                    return
                }

                "sumBTN" -> {
                    Toast.makeText(con, R.string.calculqtor_is_stupid, Toast.LENGTH_LONG).show()
                    return
                }
            }

            when (data.id) {
                "divisionBTN" -> {
                    data.oper = "/"
                    data.inputET += "/"
                    return
                }

                "multiplicationBTN" -> {
                    data.oper = "*"
                    data.inputET += "*"
                    return
                }

                "differenceBTN" -> {
                    data.oper = "-"
                    data.inputET += "-"
                    return
                }

                "sumBTN" -> {
                    data.oper = "+"
                    data.inputET += "+"
                    return
                }

                "resultBTN" -> {
                    if (data.fOIS && (data.oper != "0") && data.fOIS == false) {
                        Toast.makeText(con, R.string.calculqtor_is_stupid, Toast.LENGTH_LONG)
                            .show()
                        return
                    }
                    when (data.oper) {
                        "+" -> {
                            data.res = data.fo + data.so
                            data.completed = true
                            return
                        }

                        "-" -> {
                            data.res = data.fo - data.so
                            data.completed = true
                            return
                        }

                        "*" -> {
                            data.res = data.fo * data.so
                            data.completed = true
                            return
                        }

                        "/" -> {
                            if (data.so == 0.0) {
                                Toast.makeText(
                                    con,
                                    R.string.error_division_by_zero,
                                    Toast.LENGTH_LONG
                                )
                                    .show()
                                return
                            }
                            data.res = data.fo / data.so
                            data.completed = true
                            return
                        }
                    }
                    return
                }
            }
            return
        }
    }
}