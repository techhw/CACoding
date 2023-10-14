package use_case.clear_users;

// TODO Complete me

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = userDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }
    @Override
    public void execute() {
        String userDeleted = userDataAccessObject.clear();
        ClearOutputData clearOutputData = new ClearOutputData(userDeleted);
        clearPresenter.prepareSuccessView(clearOutputData);
    }
}
