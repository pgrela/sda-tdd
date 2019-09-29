package com.pgrela.sda.tdd.gui.tictactoe;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;

@RequestMapping("tictactoe")
@Controller
public class TicTacToeController {

    private AppLicationTicTacToeService appLicationTicTacToeService;

    public TicTacToeController(AppLicationTicTacToeService appLicationTicTacToeService) {
        this.appLicationTicTacToeService = appLicationTicTacToeService;
    }

    @GetMapping()
    public ModelAndView tic() {
        return new ModelAndView("tictactoe",
                Collections.singletonMap(
                        "board", appLicationTicTacToeService.getBoardView()));
    }

    @PostMapping()
    public RedirectView tic(@RequestParam Map<String, String> allRequestParams) {
        if (allRequestParams.size() != 1) {
            throw new IllegalArgumentException("Should be exactly one parameter!");
        }
        Entry<String, String> onlyEntry = allRequestParams.entrySet().iterator().next();
        appLicationTicTacToeService.processCommand(onlyEntry.getKey(), onlyEntry.getValue());
        return new RedirectView("/tictactoe");
    }
}
