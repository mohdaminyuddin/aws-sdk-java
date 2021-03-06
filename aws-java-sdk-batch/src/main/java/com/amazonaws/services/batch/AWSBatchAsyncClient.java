/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.batch;

import com.amazonaws.services.batch.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Client for accessing AWS Batch asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <p>
 * AWS Batch enables you to run batch computing workloads on the AWS Cloud. Batch computing is a common way for
 * developers, scientists, and engineers to access large amounts of compute resources, and AWS Batch removes the
 * undifferentiated heavy lifting of configuring and managing the required infrastructure. AWS Batch will be familiar to
 * users of traditional batch computing software. This service can efficiently provision resources in response to jobs
 * submitted in order to eliminate capacity constraints, reduce compute costs, and deliver results quickly.
 * </p>
 * <p>
 * As a fully managed service, AWS Batch enables developers, scientists, and engineers to run batch computing workloads
 * of any scale. AWS Batch automatically provisions compute resources and optimizes the workload distribution based on
 * the quantity and scale of the workloads. With AWS Batch, there is no need to install or manage batch computing
 * software, which allows you to focus on analyzing results and solving problems. AWS Batch reduces operational
 * complexities, saves time, and reduces costs, which makes it easy for developers, scientists, and engineers to run
 * their batch jobs in the AWS Cloud.
 * </p>
 */
@ThreadSafe
public class AWSBatchAsyncClient extends AWSBatchClient implements AWSBatchAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Batch. A credentials provider chain will be
     * used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSBatchAsyncClient() {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Batch. A credentials provider chain will be
     * used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing a number of threads equal to the
     * maximum number of concurrent connections configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Batch (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSBatchAsyncClient(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, java.util.concurrent.Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Batch using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSBatchAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Batch using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSBatchAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Batch using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSBatchAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Batch using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSBatchAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Batch using the provided AWS account
     * credentials provider and client configuration options.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing a number of threads equal to the
     * maximum number of concurrent connections configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSBatchAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration, java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Batch using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSBatchAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Batch using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSBatchAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Batch using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSBatchAsyncClient(AwsAsyncClientParams asyncClientParams) {
        super(asyncClientParams);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public java.util.concurrent.ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<CancelJobResult> cancelJobAsync(CancelJobRequest request) {

        return cancelJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelJobResult> cancelJobAsync(final CancelJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelJobRequest, CancelJobResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CancelJobResult>() {
            @Override
            public CancelJobResult call() throws Exception {
                CancelJobResult result;

                try {
                    result = cancelJob(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateComputeEnvironmentResult> createComputeEnvironmentAsync(CreateComputeEnvironmentRequest request) {

        return createComputeEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateComputeEnvironmentResult> createComputeEnvironmentAsync(final CreateComputeEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateComputeEnvironmentRequest, CreateComputeEnvironmentResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateComputeEnvironmentResult>() {
            @Override
            public CreateComputeEnvironmentResult call() throws Exception {
                CreateComputeEnvironmentResult result;

                try {
                    result = createComputeEnvironment(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateJobQueueResult> createJobQueueAsync(CreateJobQueueRequest request) {

        return createJobQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateJobQueueResult> createJobQueueAsync(final CreateJobQueueRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateJobQueueRequest, CreateJobQueueResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateJobQueueResult>() {
            @Override
            public CreateJobQueueResult call() throws Exception {
                CreateJobQueueResult result;

                try {
                    result = createJobQueue(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteComputeEnvironmentResult> deleteComputeEnvironmentAsync(DeleteComputeEnvironmentRequest request) {

        return deleteComputeEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteComputeEnvironmentResult> deleteComputeEnvironmentAsync(final DeleteComputeEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteComputeEnvironmentRequest, DeleteComputeEnvironmentResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteComputeEnvironmentResult>() {
            @Override
            public DeleteComputeEnvironmentResult call() throws Exception {
                DeleteComputeEnvironmentResult result;

                try {
                    result = deleteComputeEnvironment(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteJobQueueResult> deleteJobQueueAsync(DeleteJobQueueRequest request) {

        return deleteJobQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteJobQueueResult> deleteJobQueueAsync(final DeleteJobQueueRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteJobQueueRequest, DeleteJobQueueResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteJobQueueResult>() {
            @Override
            public DeleteJobQueueResult call() throws Exception {
                DeleteJobQueueResult result;

                try {
                    result = deleteJobQueue(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeregisterJobDefinitionResult> deregisterJobDefinitionAsync(DeregisterJobDefinitionRequest request) {

        return deregisterJobDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterJobDefinitionResult> deregisterJobDefinitionAsync(final DeregisterJobDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterJobDefinitionRequest, DeregisterJobDefinitionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeregisterJobDefinitionResult>() {
            @Override
            public DeregisterJobDefinitionResult call() throws Exception {
                DeregisterJobDefinitionResult result;

                try {
                    result = deregisterJobDefinition(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeComputeEnvironmentsResult> describeComputeEnvironmentsAsync(DescribeComputeEnvironmentsRequest request) {

        return describeComputeEnvironmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeComputeEnvironmentsResult> describeComputeEnvironmentsAsync(final DescribeComputeEnvironmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeComputeEnvironmentsRequest, DescribeComputeEnvironmentsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeComputeEnvironmentsResult>() {
            @Override
            public DescribeComputeEnvironmentsResult call() throws Exception {
                DescribeComputeEnvironmentsResult result;

                try {
                    result = describeComputeEnvironments(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeJobDefinitionsResult> describeJobDefinitionsAsync(DescribeJobDefinitionsRequest request) {

        return describeJobDefinitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeJobDefinitionsResult> describeJobDefinitionsAsync(final DescribeJobDefinitionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeJobDefinitionsRequest, DescribeJobDefinitionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeJobDefinitionsResult>() {
            @Override
            public DescribeJobDefinitionsResult call() throws Exception {
                DescribeJobDefinitionsResult result;

                try {
                    result = describeJobDefinitions(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeJobQueuesResult> describeJobQueuesAsync(DescribeJobQueuesRequest request) {

        return describeJobQueuesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeJobQueuesResult> describeJobQueuesAsync(final DescribeJobQueuesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeJobQueuesRequest, DescribeJobQueuesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeJobQueuesResult>() {
            @Override
            public DescribeJobQueuesResult call() throws Exception {
                DescribeJobQueuesResult result;

                try {
                    result = describeJobQueues(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeJobsResult> describeJobsAsync(DescribeJobsRequest request) {

        return describeJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeJobsResult> describeJobsAsync(final DescribeJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeJobsRequest, DescribeJobsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeJobsResult>() {
            @Override
            public DescribeJobsResult call() throws Exception {
                DescribeJobsResult result;

                try {
                    result = describeJobs(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest request) {

        return listJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(final ListJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListJobsResult>() {
            @Override
            public ListJobsResult call() throws Exception {
                ListJobsResult result;

                try {
                    result = listJobs(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RegisterJobDefinitionResult> registerJobDefinitionAsync(RegisterJobDefinitionRequest request) {

        return registerJobDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterJobDefinitionResult> registerJobDefinitionAsync(final RegisterJobDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterJobDefinitionRequest, RegisterJobDefinitionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RegisterJobDefinitionResult>() {
            @Override
            public RegisterJobDefinitionResult call() throws Exception {
                RegisterJobDefinitionResult result;

                try {
                    result = registerJobDefinition(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SubmitJobResult> submitJobAsync(SubmitJobRequest request) {

        return submitJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SubmitJobResult> submitJobAsync(final SubmitJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<SubmitJobRequest, SubmitJobResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<SubmitJobResult>() {
            @Override
            public SubmitJobResult call() throws Exception {
                SubmitJobResult result;

                try {
                    result = submitJob(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<TerminateJobResult> terminateJobAsync(TerminateJobRequest request) {

        return terminateJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TerminateJobResult> terminateJobAsync(final TerminateJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<TerminateJobRequest, TerminateJobResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<TerminateJobResult>() {
            @Override
            public TerminateJobResult call() throws Exception {
                TerminateJobResult result;

                try {
                    result = terminateJob(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateComputeEnvironmentResult> updateComputeEnvironmentAsync(UpdateComputeEnvironmentRequest request) {

        return updateComputeEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateComputeEnvironmentResult> updateComputeEnvironmentAsync(final UpdateComputeEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateComputeEnvironmentRequest, UpdateComputeEnvironmentResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateComputeEnvironmentResult>() {
            @Override
            public UpdateComputeEnvironmentResult call() throws Exception {
                UpdateComputeEnvironmentResult result;

                try {
                    result = updateComputeEnvironment(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateJobQueueResult> updateJobQueueAsync(UpdateJobQueueRequest request) {

        return updateJobQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateJobQueueResult> updateJobQueueAsync(final UpdateJobQueueRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateJobQueueRequest, UpdateJobQueueResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateJobQueueResult>() {
            @Override
            public UpdateJobQueueResult call() throws Exception {
                UpdateJobQueueResult result;

                try {
                    result = updateJobQueue(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
